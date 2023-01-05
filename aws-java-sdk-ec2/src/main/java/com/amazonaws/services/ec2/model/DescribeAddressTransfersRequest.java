/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeAddressTransfersRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressTransfersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeAddressTransfersRequest> {

    /**
     * <p>
     * The allocation IDs of Elastic IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allocationIds;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of address transfers to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The allocation IDs of Elastic IP addresses.
     * </p>
     * 
     * @return The allocation IDs of Elastic IP addresses.
     */

    public java.util.List<String> getAllocationIds() {
        if (allocationIds == null) {
            allocationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allocationIds;
    }

    /**
     * <p>
     * The allocation IDs of Elastic IP addresses.
     * </p>
     * 
     * @param allocationIds
     *        The allocation IDs of Elastic IP addresses.
     */

    public void setAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
            return;
        }

        this.allocationIds = new com.amazonaws.internal.SdkInternalList<String>(allocationIds);
    }

    /**
     * <p>
     * The allocation IDs of Elastic IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllocationIds(java.util.Collection)} or {@link #withAllocationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allocationIds
     *        The allocation IDs of Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersRequest withAllocationIds(String... allocationIds) {
        if (this.allocationIds == null) {
            setAllocationIds(new com.amazonaws.internal.SdkInternalList<String>(allocationIds.length));
        }
        for (String ele : allocationIds) {
            this.allocationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allocation IDs of Elastic IP addresses.
     * </p>
     * 
     * @param allocationIds
     *        The allocation IDs of Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        setAllocationIds(allocationIds);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of address transfers to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of address transfers to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of address transfers to return in one page of results.
     * </p>
     * 
     * @return The maximum number of address transfers to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of address transfers to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of address transfers to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressTransfersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeAddressTransfersRequest> getDryRunRequest() {
        Request<DescribeAddressTransfersRequest> request = new DescribeAddressTransfersRequestMarshaller().marshall(this);
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
        if (getAllocationIds() != null)
            sb.append("AllocationIds: ").append(getAllocationIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddressTransfersRequest == false)
            return false;
        DescribeAddressTransfersRequest other = (DescribeAddressTransfersRequest) obj;
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null)
            return false;
        if (other.getAllocationIds() != null && other.getAllocationIds().equals(this.getAllocationIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationIds() == null) ? 0 : getAllocationIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddressTransfersRequest clone() {
        return (DescribeAddressTransfersRequest) super.clone();
    }
}
