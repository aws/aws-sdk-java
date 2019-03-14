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
import com.amazonaws.services.ec2.model.transform.DescribeHostReservationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostReservationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeHostReservationsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (<code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filter;
    /**
     * <p>
     * One or more host reservation IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostReservationIdSet;
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
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (<code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *         <code>AllUpfront</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the reservation (<code>payment-pending</code> |
     *         <code>payment-failed</code> | <code>active</code> | <code>retired</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
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
     * <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (<code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *        <code>AllUpfront</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the reservation (<code>payment-pending</code> |
     *        <code>payment-failed</code> | <code>active</code> | <code>retired</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
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
     * <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (<code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
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
     *        <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *        <code>AllUpfront</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the reservation (<code>payment-pending</code> |
     *        <code>payment-failed</code> | <code>active</code> | <code>retired</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationsRequest withFilter(Filter... filter) {
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
     * <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     * <code>AllUpfront</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the reservation (<code>payment-pending</code> | <code>payment-failed</code> |
     * <code>active</code> | <code>retired</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>instance-family</code> - The instance family (for example, <code>m4</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>payment-option</code> - The payment option (<code>NoUpfront</code> | <code>PartialUpfront</code> |
     *        <code>AllUpfront</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the reservation (<code>payment-pending</code> |
     *        <code>payment-failed</code> | <code>active</code> | <code>retired</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * One or more host reservation IDs.
     * </p>
     * 
     * @return One or more host reservation IDs.
     */

    public java.util.List<String> getHostReservationIdSet() {
        if (hostReservationIdSet == null) {
            hostReservationIdSet = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostReservationIdSet;
    }

    /**
     * <p>
     * One or more host reservation IDs.
     * </p>
     * 
     * @param hostReservationIdSet
     *        One or more host reservation IDs.
     */

    public void setHostReservationIdSet(java.util.Collection<String> hostReservationIdSet) {
        if (hostReservationIdSet == null) {
            this.hostReservationIdSet = null;
            return;
        }

        this.hostReservationIdSet = new com.amazonaws.internal.SdkInternalList<String>(hostReservationIdSet);
    }

    /**
     * <p>
     * One or more host reservation IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostReservationIdSet(java.util.Collection)} or {@link #withHostReservationIdSet(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hostReservationIdSet
     *        One or more host reservation IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationsRequest withHostReservationIdSet(String... hostReservationIdSet) {
        if (this.hostReservationIdSet == null) {
            setHostReservationIdSet(new com.amazonaws.internal.SdkInternalList<String>(hostReservationIdSet.length));
        }
        for (String ele : hostReservationIdSet) {
            this.hostReservationIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more host reservation IDs.
     * </p>
     * 
     * @param hostReservationIdSet
     *        One or more host reservation IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostReservationsRequest withHostReservationIdSet(java.util.Collection<String> hostReservationIdSet) {
        setHostReservationIdSet(hostReservationIdSet);
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

    public DescribeHostReservationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public DescribeHostReservationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeHostReservationsRequest> getDryRunRequest() {
        Request<DescribeHostReservationsRequest> request = new DescribeHostReservationsRequestMarshaller().marshall(this);
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
        if (getHostReservationIdSet() != null)
            sb.append("HostReservationIdSet: ").append(getHostReservationIdSet()).append(",");
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

        if (obj instanceof DescribeHostReservationsRequest == false)
            return false;
        DescribeHostReservationsRequest other = (DescribeHostReservationsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getHostReservationIdSet() == null ^ this.getHostReservationIdSet() == null)
            return false;
        if (other.getHostReservationIdSet() != null && other.getHostReservationIdSet().equals(this.getHostReservationIdSet()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getHostReservationIdSet() == null) ? 0 : getHostReservationIdSet().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostReservationsRequest clone() {
        return (DescribeHostReservationsRequest) super.clone();
    }
}
