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
import com.amazonaws.services.ec2.model.transform.DescribeSpotFleetRequestsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeSpotFleetRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotFleetRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSpotFleetRequestsRequest> {

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> spotFleetRequestIds;

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *        value is 1000. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *         value is 1000. To retrieve the remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default value
     * is 1000. To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and 1000. The default
     *        value is 1000. To retrieve the remaining results, make another call with the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * 
     * @return The IDs of the Spot Fleet requests.
     */

    public java.util.List<String> getSpotFleetRequestIds() {
        if (spotFleetRequestIds == null) {
            spotFleetRequestIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return spotFleetRequestIds;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * 
     * @param spotFleetRequestIds
     *        The IDs of the Spot Fleet requests.
     */

    public void setSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
            return;
        }

        this.spotFleetRequestIds = new com.amazonaws.internal.SdkInternalList<String>(spotFleetRequestIds);
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotFleetRequestIds(java.util.Collection)} or {@link #withSpotFleetRequestIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param spotFleetRequestIds
     *        The IDs of the Spot Fleet requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsRequest withSpotFleetRequestIds(String... spotFleetRequestIds) {
        if (this.spotFleetRequestIds == null) {
            setSpotFleetRequestIds(new com.amazonaws.internal.SdkInternalList<String>(spotFleetRequestIds.length));
        }
        for (String ele : spotFleetRequestIds) {
            this.spotFleetRequestIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * 
     * @param spotFleetRequestIds
     *        The IDs of the Spot Fleet requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestsRequest withSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        setSpotFleetRequestIds(spotFleetRequestIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotFleetRequestsRequest> getDryRunRequest() {
        Request<DescribeSpotFleetRequestsRequest> request = new DescribeSpotFleetRequestsRequestMarshaller().marshall(this);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSpotFleetRequestIds() != null)
            sb.append("SpotFleetRequestIds: ").append(getSpotFleetRequestIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotFleetRequestsRequest == false)
            return false;
        DescribeSpotFleetRequestsRequest other = (DescribeSpotFleetRequestsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotFleetRequestIds() == null ^ this.getSpotFleetRequestIds() == null)
            return false;
        if (other.getSpotFleetRequestIds() != null && other.getSpotFleetRequestIds().equals(this.getSpotFleetRequestIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestIds() == null) ? 0 : getSpotFleetRequestIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotFleetRequestsRequest clone() {
        return (DescribeSpotFleetRequestsRequest) super.clone();
    }
}
