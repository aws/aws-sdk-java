/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSpotFleetRequestsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotFleetRequests(DescribeSpotFleetRequestsRequest) DescribeSpotFleetRequests operation}.
 * <p>
 * Describes your Spot fleet requests.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotFleetRequests(DescribeSpotFleetRequestsRequest)
 */
public class DescribeSpotFleetRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSpotFleetRequestsRequest> {

    /**
     * The IDs of the Spot fleet requests.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> spotFleetRequestIds;

    /**
     * The token for the next set of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     */
    private Integer maxResults;

    /**
     * The IDs of the Spot fleet requests.
     *
     * @return The IDs of the Spot fleet requests.
     */
    public java.util.List<String> getSpotFleetRequestIds() {
        if (spotFleetRequestIds == null) {
              spotFleetRequestIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              spotFleetRequestIds.setAutoConstruct(true);
        }
        return spotFleetRequestIds;
    }
    
    /**
     * The IDs of the Spot fleet requests.
     *
     * @param spotFleetRequestIds The IDs of the Spot fleet requests.
     */
    public void setSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> spotFleetRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotFleetRequestIds.size());
        spotFleetRequestIdsCopy.addAll(spotFleetRequestIds);
        this.spotFleetRequestIds = spotFleetRequestIdsCopy;
    }
    
    /**
     * The IDs of the Spot fleet requests.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSpotFleetRequestIds(java.util.Collection)} or
     * {@link #withSpotFleetRequestIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestIds The IDs of the Spot fleet requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestsRequest withSpotFleetRequestIds(String... spotFleetRequestIds) {
        if (getSpotFleetRequestIds() == null) setSpotFleetRequestIds(new java.util.ArrayList<String>(spotFleetRequestIds.length));
        for (String value : spotFleetRequestIds) {
            getSpotFleetRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Spot fleet requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestIds The IDs of the Spot fleet requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestsRequest withSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> spotFleetRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotFleetRequestIds.size());
            spotFleetRequestIdsCopy.addAll(spotFleetRequestIds);
            this.spotFleetRequestIds = spotFleetRequestIdsCopy;
        }

        return this;
    }

    /**
     * The token for the next set of results.
     *
     * @return The token for the next set of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of results.
     *
     * @param nextToken The token for the next set of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @return The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return in a single call. Specify a
     * value between 1 and 1000. The default value is 1000. To retrieve the
     * remaining results, make another call with the returned
     * <code>NextToken</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return in a single call. Specify a
     *         value between 1 and 1000. The default value is 1000. To retrieve the
     *         remaining results, make another call with the returned
     *         <code>NextToken</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotFleetRequestsRequest> getDryRunRequest() {
        Request<DescribeSpotFleetRequestsRequest> request = new DescribeSpotFleetRequestsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotFleetRequestIds() != null) sb.append("SpotFleetRequestIds: " + getSpotFleetRequestIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestIds() == null) ? 0 : getSpotFleetRequestIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotFleetRequestsRequest == false) return false;
        DescribeSpotFleetRequestsRequest other = (DescribeSpotFleetRequestsRequest)obj;
        
        if (other.getSpotFleetRequestIds() == null ^ this.getSpotFleetRequestIds() == null) return false;
        if (other.getSpotFleetRequestIds() != null && other.getSpotFleetRequestIds().equals(this.getSpotFleetRequestIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSpotFleetRequestsRequest clone() {
        
            return (DescribeSpotFleetRequestsRequest) super.clone();
    }

}
    