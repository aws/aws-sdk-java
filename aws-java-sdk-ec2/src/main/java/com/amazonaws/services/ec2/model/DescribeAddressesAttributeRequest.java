/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeAddressesAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressesAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeAddressesAttributeRequest> {

    /**
     * <p>
     * [EC2-VPC] The allocation IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allocationIds;
    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * [EC2-VPC] The allocation IDs.
     * </p>
     * 
     * @return [EC2-VPC] The allocation IDs.
     */

    public java.util.List<String> getAllocationIds() {
        if (allocationIds == null) {
            allocationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allocationIds;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation IDs.
     * </p>
     * 
     * @param allocationIds
     *        [EC2-VPC] The allocation IDs.
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
     * [EC2-VPC] The allocation IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllocationIds(java.util.Collection)} or {@link #withAllocationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allocationIds
     *        [EC2-VPC] The allocation IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesAttributeRequest withAllocationIds(String... allocationIds) {
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
     * [EC2-VPC] The allocation IDs.
     * </p>
     * 
     * @param allocationIds
     *        [EC2-VPC] The allocation IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesAttributeRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        setAllocationIds(allocationIds);
        return this;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @param attribute
     *        The attribute of the IP address.
     * @see AddressAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @return The attribute of the IP address.
     * @see AddressAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @param attribute
     *        The attribute of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressAttributeName
     */

    public DescribeAddressesAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute of the IP address.
     * </p>
     * 
     * @param attribute
     *        The attribute of the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddressAttributeName
     */

    public DescribeAddressesAttributeRequest withAttribute(AddressAttributeName attribute) {
        this.attribute = attribute.toString();
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

    public DescribeAddressesAttributeRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesAttributeRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeAddressesAttributeRequest> getDryRunRequest() {
        Request<DescribeAddressesAttributeRequest> request = new DescribeAddressesAttributeRequestMarshaller().marshall(this);
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
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

        if (obj instanceof DescribeAddressesAttributeRequest == false)
            return false;
        DescribeAddressesAttributeRequest other = (DescribeAddressesAttributeRequest) obj;
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null)
            return false;
        if (other.getAllocationIds() != null && other.getAllocationIds().equals(this.getAllocationIds()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
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
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddressesAttributeRequest clone() {
        return (DescribeAddressesAttributeRequest) super.clone();
    }
}
