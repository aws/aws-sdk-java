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
import com.amazonaws.services.ec2.model.transform.DescribeCapacityBlockOfferingsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityBlockOfferingsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeCapacityBlockOfferingsRequest> {

    /**
     * <p>
     * The type of instance for which the Capacity Block offering reserves capacity.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The earliest start date for the Capacity Block offering.
     * </p>
     */
    private java.util.Date startDateRange;
    /**
     * <p>
     * The latest end date for the Capacity Block offering.
     * </p>
     */
    private java.util.Date endDateRange;
    /**
     * <p>
     * The number of hours for which to reserve Capacity Block.
     * </p>
     */
    private Integer capacityDurationHours;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
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
     * The type of instance for which the Capacity Block offering reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for which the Capacity Block offering reserves capacity.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Block offering reserves capacity.
     * </p>
     * 
     * @return The type of instance for which the Capacity Block offering reserves capacity.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance for which the Capacity Block offering reserves capacity.
     * </p>
     * 
     * @param instanceType
     *        The type of instance for which the Capacity Block offering reserves capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances for which to reserve capacity.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @return The number of instances for which to reserve capacity.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances for which to reserve capacity.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances for which to reserve capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The earliest start date for the Capacity Block offering.
     * </p>
     * 
     * @param startDateRange
     *        The earliest start date for the Capacity Block offering.
     */

    public void setStartDateRange(java.util.Date startDateRange) {
        this.startDateRange = startDateRange;
    }

    /**
     * <p>
     * The earliest start date for the Capacity Block offering.
     * </p>
     * 
     * @return The earliest start date for the Capacity Block offering.
     */

    public java.util.Date getStartDateRange() {
        return this.startDateRange;
    }

    /**
     * <p>
     * The earliest start date for the Capacity Block offering.
     * </p>
     * 
     * @param startDateRange
     *        The earliest start date for the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsRequest withStartDateRange(java.util.Date startDateRange) {
        setStartDateRange(startDateRange);
        return this;
    }

    /**
     * <p>
     * The latest end date for the Capacity Block offering.
     * </p>
     * 
     * @param endDateRange
     *        The latest end date for the Capacity Block offering.
     */

    public void setEndDateRange(java.util.Date endDateRange) {
        this.endDateRange = endDateRange;
    }

    /**
     * <p>
     * The latest end date for the Capacity Block offering.
     * </p>
     * 
     * @return The latest end date for the Capacity Block offering.
     */

    public java.util.Date getEndDateRange() {
        return this.endDateRange;
    }

    /**
     * <p>
     * The latest end date for the Capacity Block offering.
     * </p>
     * 
     * @param endDateRange
     *        The latest end date for the Capacity Block offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsRequest withEndDateRange(java.util.Date endDateRange) {
        setEndDateRange(endDateRange);
        return this;
    }

    /**
     * <p>
     * The number of hours for which to reserve Capacity Block.
     * </p>
     * 
     * @param capacityDurationHours
     *        The number of hours for which to reserve Capacity Block.
     */

    public void setCapacityDurationHours(Integer capacityDurationHours) {
        this.capacityDurationHours = capacityDurationHours;
    }

    /**
     * <p>
     * The number of hours for which to reserve Capacity Block.
     * </p>
     * 
     * @return The number of hours for which to reserve Capacity Block.
     */

    public Integer getCapacityDurationHours() {
        return this.capacityDurationHours;
    }

    /**
     * <p>
     * The number of hours for which to reserve Capacity Block.
     * </p>
     * 
     * @param capacityDurationHours
     *        The number of hours for which to reserve Capacity Block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCapacityBlockOfferingsRequest withCapacityDurationHours(Integer capacityDurationHours) {
        setCapacityDurationHours(capacityDurationHours);
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

    public DescribeCapacityBlockOfferingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

    public DescribeCapacityBlockOfferingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeCapacityBlockOfferingsRequest> getDryRunRequest() {
        Request<DescribeCapacityBlockOfferingsRequest> request = new DescribeCapacityBlockOfferingsRequestMarshaller().marshall(this);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getStartDateRange() != null)
            sb.append("StartDateRange: ").append(getStartDateRange()).append(",");
        if (getEndDateRange() != null)
            sb.append("EndDateRange: ").append(getEndDateRange()).append(",");
        if (getCapacityDurationHours() != null)
            sb.append("CapacityDurationHours: ").append(getCapacityDurationHours()).append(",");
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

        if (obj instanceof DescribeCapacityBlockOfferingsRequest == false)
            return false;
        DescribeCapacityBlockOfferingsRequest other = (DescribeCapacityBlockOfferingsRequest) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getStartDateRange() == null ^ this.getStartDateRange() == null)
            return false;
        if (other.getStartDateRange() != null && other.getStartDateRange().equals(this.getStartDateRange()) == false)
            return false;
        if (other.getEndDateRange() == null ^ this.getEndDateRange() == null)
            return false;
        if (other.getEndDateRange() != null && other.getEndDateRange().equals(this.getEndDateRange()) == false)
            return false;
        if (other.getCapacityDurationHours() == null ^ this.getCapacityDurationHours() == null)
            return false;
        if (other.getCapacityDurationHours() != null && other.getCapacityDurationHours().equals(this.getCapacityDurationHours()) == false)
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

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getStartDateRange() == null) ? 0 : getStartDateRange().hashCode());
        hashCode = prime * hashCode + ((getEndDateRange() == null) ? 0 : getEndDateRange().hashCode());
        hashCode = prime * hashCode + ((getCapacityDurationHours() == null) ? 0 : getCapacityDurationHours().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCapacityBlockOfferingsRequest clone() {
        return (DescribeCapacityBlockOfferingsRequest) super.clone();
    }
}
