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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/GetCostEstimation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostEstimationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     * </p>
     */
    private CostEstimationResourceCollectionFilter resourceCollection;
    /**
     * <p>
     * The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     * returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate to
     * analyze one of your AWS resources.
     * </p>
     */
    private java.util.List<ServiceResourceCost> costs;
    /**
     * <p>
     * The start and end time of the cost estimation.
     * </p>
     */
    private CostEstimationTimeRange timeRange;
    /**
     * <p>
     * The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to analyze
     * each resource in the <code>Costs</code> object in this response.
     * </p>
     */
    private Double totalCost;
    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     * </p>
     * 
     * @param resourceCollection
     *        The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     */

    public void setResourceCollection(CostEstimationResourceCollectionFilter resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * <p>
     * The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     * </p>
     * 
     * @return The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     */

    public CostEstimationResourceCollectionFilter getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * <p>
     * The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     * </p>
     * 
     * @param resourceCollection
     *        The collection of the AWS resources used to create your monthly DevOps Guru cost estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimationResult withResourceCollection(CostEstimationResourceCollectionFilter resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     * returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * </p>
     * 
     * @param status
     *        The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     *        returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * @see CostEstimationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     * returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * </p>
     * 
     * @return The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     *         returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * @see CostEstimationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     * returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * </p>
     * 
     * @param status
     *        The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     *        returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostEstimationStatus
     */

    public GetCostEstimationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     * returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * </p>
     * 
     * @param status
     *        The status of creating this cost estimate. If it's still in progress, the status <code>ONGOING</code> is
     *        returned. If it is finished, the status <code>COMPLETED</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostEstimationStatus
     */

    public GetCostEstimationResult withStatus(CostEstimationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate to
     * analyze one of your AWS resources.
     * </p>
     * 
     * @return An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate
     *         to analyze one of your AWS resources.
     */

    public java.util.List<ServiceResourceCost> getCosts() {
        return costs;
    }

    /**
     * <p>
     * An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate to
     * analyze one of your AWS resources.
     * </p>
     * 
     * @param costs
     *        An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate
     *        to analyze one of your AWS resources.
     */

    public void setCosts(java.util.Collection<ServiceResourceCost> costs) {
        if (costs == null) {
            this.costs = null;
            return;
        }

        this.costs = new java.util.ArrayList<ServiceResourceCost>(costs);
    }

    /**
     * <p>
     * An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate to
     * analyze one of your AWS resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCosts(java.util.Collection)} or {@link #withCosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param costs
     *        An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate
     *        to analyze one of your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimationResult withCosts(ServiceResourceCost... costs) {
        if (this.costs == null) {
            setCosts(new java.util.ArrayList<ServiceResourceCost>(costs.length));
        }
        for (ServiceResourceCost ele : costs) {
            this.costs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate to
     * analyze one of your AWS resources.
     * </p>
     * 
     * @param costs
     *        An array of <code>ResourceCost</code> objects that each contains details about the monthly cost estimate
     *        to analyze one of your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimationResult withCosts(java.util.Collection<ServiceResourceCost> costs) {
        setCosts(costs);
        return this;
    }

    /**
     * <p>
     * The start and end time of the cost estimation.
     * </p>
     * 
     * @param timeRange
     *        The start and end time of the cost estimation.
     */

    public void setTimeRange(CostEstimationTimeRange timeRange) {
        this.timeRange = timeRange;
    }

    /**
     * <p>
     * The start and end time of the cost estimation.
     * </p>
     * 
     * @return The start and end time of the cost estimation.
     */

    public CostEstimationTimeRange getTimeRange() {
        return this.timeRange;
    }

    /**
     * <p>
     * The start and end time of the cost estimation.
     * </p>
     * 
     * @param timeRange
     *        The start and end time of the cost estimation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimationResult withTimeRange(CostEstimationTimeRange timeRange) {
        setTimeRange(timeRange);
        return this;
    }

    /**
     * <p>
     * The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to analyze
     * each resource in the <code>Costs</code> object in this response.
     * </p>
     * 
     * @param totalCost
     *        The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to
     *        analyze each resource in the <code>Costs</code> object in this response.
     */

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * <p>
     * The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to analyze
     * each resource in the <code>Costs</code> object in this response.
     * </p>
     * 
     * @return The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to
     *         analyze each resource in the <code>Costs</code> object in this response.
     */

    public Double getTotalCost() {
        return this.totalCost;
    }

    /**
     * <p>
     * The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to analyze
     * each resource in the <code>Costs</code> object in this response.
     * </p>
     * 
     * @param totalCost
     *        The estimated monthly cost to analyze the AWS resources. This value is the sum of the estimated costs to
     *        analyze each resource in the <code>Costs</code> object in this response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimationResult withTotalCost(Double totalCost) {
        setTotalCost(totalCost);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @return The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *         pages, this value is null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages,
     * this value is null.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to retrieve the next page of results for this operation. If there are no more
     *        pages, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostEstimationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCosts() != null)
            sb.append("Costs: ").append(getCosts()).append(",");
        if (getTimeRange() != null)
            sb.append("TimeRange: ").append(getTimeRange()).append(",");
        if (getTotalCost() != null)
            sb.append("TotalCost: ").append(getTotalCost()).append(",");
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

        if (obj instanceof GetCostEstimationResult == false)
            return false;
        GetCostEstimationResult other = (GetCostEstimationResult) obj;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCosts() == null ^ this.getCosts() == null)
            return false;
        if (other.getCosts() != null && other.getCosts().equals(this.getCosts()) == false)
            return false;
        if (other.getTimeRange() == null ^ this.getTimeRange() == null)
            return false;
        if (other.getTimeRange() != null && other.getTimeRange().equals(this.getTimeRange()) == false)
            return false;
        if (other.getTotalCost() == null ^ this.getTotalCost() == null)
            return false;
        if (other.getTotalCost() != null && other.getTotalCost().equals(this.getTotalCost()) == false)
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

        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCosts() == null) ? 0 : getCosts().hashCode());
        hashCode = prime * hashCode + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
        hashCode = prime * hashCode + ((getTotalCost() == null) ? 0 : getTotalCost().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCostEstimationResult clone() {
        try {
            return (GetCostEstimationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
