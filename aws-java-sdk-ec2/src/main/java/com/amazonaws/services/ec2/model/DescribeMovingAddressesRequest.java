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
import com.amazonaws.services.ec2.model.transform.DescribeMovingAddressesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMovingAddressesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeMovingAddressesRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> publicIps;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     *         <code>RestoringToClassic</code>).
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     *        <code>RestoringToClassic</code>).
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>).
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
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     *        <code>RestoringToClassic</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMovingAddressesRequest withFilters(Filter... filters) {
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>moving-status</code> - The status of the Elastic IP address (<code>MovingToVpc</code> |
     *        <code>RestoringToClassic</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMovingAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *        This value can be between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range,
     *        an error is returned.</p>
     *        <p>
     *        Default: If no value is provided, the default is 1000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results of the
     *         initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *         This value can be between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range,
     *         an error is returned.</p>
     *         <p>
     *         Default: If no value is provided, the default is 1000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range, an error is returned.
     * </p>
     * <p>
     * Default: If no value is provided, the default is 1000.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *        This value can be between 5 and 1000; if <code>MaxResults</code> is given a value outside of this range,
     *        an error is returned.</p>
     *        <p>
     *        Default: If no value is provided, the default is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMovingAddressesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMovingAddressesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * 
     * @return One or more Elastic IP addresses.
     */

    public java.util.List<String> getPublicIps() {
        if (publicIps == null) {
            publicIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return publicIps;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * 
     * @param publicIps
     *        One or more Elastic IP addresses.
     */

    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }

        this.publicIps = new com.amazonaws.internal.SdkInternalList<String>(publicIps);
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicIps(java.util.Collection)} or {@link #withPublicIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publicIps
     *        One or more Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMovingAddressesRequest withPublicIps(String... publicIps) {
        if (this.publicIps == null) {
            setPublicIps(new com.amazonaws.internal.SdkInternalList<String>(publicIps.length));
        }
        for (String ele : publicIps) {
            this.publicIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * 
     * @param publicIps
     *        One or more Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMovingAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        setPublicIps(publicIps);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeMovingAddressesRequest> getDryRunRequest() {
        Request<DescribeMovingAddressesRequest> request = new DescribeMovingAddressesRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPublicIps() != null)
            sb.append("PublicIps: ").append(getPublicIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMovingAddressesRequest == false)
            return false;
        DescribeMovingAddressesRequest other = (DescribeMovingAddressesRequest) obj;
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
        if (other.getPublicIps() == null ^ this.getPublicIps() == null)
            return false;
        if (other.getPublicIps() != null && other.getPublicIps().equals(this.getPublicIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMovingAddressesRequest clone() {
        return (DescribeMovingAddressesRequest) super.clone();
    }
}
