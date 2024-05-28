/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeInstanceTypeOfferingsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTypeOfferingsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstanceTypeOfferingsRequest> {

    /**
     * <p>
     * The location type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     * Availability Zone for the current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> - The current Region. If you specify a location filter, it must match the current Region.
     * </p>
     * </li>
     * </ul>
     */
    private String locationType;
    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type. For a list of possible values, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>location</code> - The location. For a list of possible identifiers, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions and
     * Zones</a>.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The location type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     * Availability Zone for the current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> - The current Region. If you specify a location filter, it must match the current Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param locationType
     *        The location type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     *        Availability Zone for the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for
     *        the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for
     *        the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region</code> - The current Region. If you specify a location filter, it must match the current
     *        Region.
     *        </p>
     *        </li>
     * @see LocationType
     */

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     * Availability Zone for the current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> - The current Region. If you specify a location filter, it must match the current Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The location type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     *         Availability Zone for the current Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID
     *         for the current Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for
     *         the current Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region</code> - The current Region. If you specify a location filter, it must match the current
     *         Region.
     *         </p>
     *         </li>
     * @see LocationType
     */

    public String getLocationType() {
        return this.locationType;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     * Availability Zone for the current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> - The current Region. If you specify a location filter, it must match the current Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param locationType
     *        The location type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     *        Availability Zone for the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for
     *        the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for
     *        the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region</code> - The current Region. If you specify a location filter, it must match the current
     *        Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public DescribeInstanceTypeOfferingsRequest withLocationType(String locationType) {
        setLocationType(locationType);
        return this;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     * Availability Zone for the current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for the
     * current Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> - The current Region. If you specify a location filter, it must match the current Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param locationType
     *        The location type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone. When you specify a location filter, it must be an
     *        Availability Zone for the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone-id</code> - The AZ ID. When you specify a location filter, it must be an AZ ID for
     *        the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>outpost</code> - The Outpost ARN. When you specify a location filter, it must be an Outpost ARN for
     *        the current Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region</code> - The current Region. If you specify a location filter, it must match the current
     *        Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public DescribeInstanceTypeOfferingsRequest withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type. For a list of possible values, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>location</code> - The location. For a list of possible identifiers, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions and
     * Zones</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. Filter names and values are case-sensitive.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type. For a list of possible values, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>location</code> - The location. For a list of possible identifiers, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions
     *         and Zones</a>.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type. For a list of possible values, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>location</code> - The location. For a list of possible identifiers, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions and
     * Zones</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type. For a list of possible values, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>location</code> - The location. For a list of possible identifiers, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions
     *        and Zones</a>.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type. For a list of possible values, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>location</code> - The location. For a list of possible identifiers, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions and
     * Zones</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type. For a list of possible values, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>location</code> - The location. For a list of possible identifiers, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions
     *        and Zones</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type. For a list of possible values, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>location</code> - The location. For a list of possible identifiers, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions and
     * Zones</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type. For a list of possible values, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Instance.html">Instance</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>location</code> - The location. For a list of possible identifiers, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html">Regions
     *        and Zones</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @return The maximum number of items to return for this request. To get the next page of items, make another
     *         request with the token returned in the output. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *         >Pagination</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @return The token returned from a previous paginated request. Pagination continues from the end of the items
     *         returned by the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceTypeOfferingsRequest> getDryRunRequest() {
        Request<DescribeInstanceTypeOfferingsRequest> request = new DescribeInstanceTypeOfferingsRequestMarshaller().marshall(this);
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
        if (getLocationType() != null)
            sb.append("LocationType: ").append(getLocationType()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceTypeOfferingsRequest == false)
            return false;
        DescribeInstanceTypeOfferingsRequest other = (DescribeInstanceTypeOfferingsRequest) obj;
        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceTypeOfferingsRequest clone() {
        return (DescribeInstanceTypeOfferingsRequest) super.clone();
    }
}
