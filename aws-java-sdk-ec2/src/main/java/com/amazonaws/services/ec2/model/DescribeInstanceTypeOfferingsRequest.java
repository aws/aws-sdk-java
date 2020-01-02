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
     */
    private String locationType;
    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>location</code> - This depends on the location type. For example, if the location type is
     * <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @param locationType
     *        The location type.
     * @see LocationType
     */

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @return The location type.
     * @see LocationType
     */

    public String getLocationType() {
        return this.locationType;
    }

    /**
     * <p>
     * The location type.
     * </p>
     * 
     * @param locationType
     *        The location type.
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
     * 
     * @param locationType
     *        The location type.
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
     * <code>location</code> - This depends on the location type. For example, if the location type is
     * <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. Filter names and values are case-sensitive.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>location</code> - This depends on the location type. For example, if the location type is
     *         <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type.
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
     * <code>location</code> - This depends on the location type. For example, if the location type is
     * <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>location</code> - This depends on the location type. For example, if the location type is
     *        <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type.
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
     * <code>location</code> - This depends on the location type. For example, if the location type is
     * <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
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
     *        <code>location</code> - This depends on the location type. For example, if the location type is
     *        <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type.
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
     * <code>location</code> - This depends on the location type. For example, if the location type is
     * <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>location</code> - This depends on the location type. For example, if the location type is
     *        <code>region</code> (default), the location is the Region code (for example, <code>us-east-2</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type.
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
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the next token value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the next token value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the next token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the next token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceTypeOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
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
