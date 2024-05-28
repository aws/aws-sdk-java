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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/GetBillingGroupCostReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBillingGroupCostReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A time range for which the margin summary is effective. You can specify up to 12 months.
     * </p>
     */
    private BillingPeriodRange billingPeriodRange;
    /**
     * <p>
     * A list of strings that specify the attributes that are used to break down costs in the margin summary reports for
     * the billing group. For example, you can view your costs by the Amazon Web Service name or the billing period.
     * </p>
     */
    private java.util.List<String> groupBy;
    /**
     * <p>
     * The maximum number of margin summary reports to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) that uniquely identifies the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A time range for which the margin summary is effective. You can specify up to 12 months.
     * </p>
     * 
     * @param billingPeriodRange
     *        A time range for which the margin summary is effective. You can specify up to 12 months.
     */

    public void setBillingPeriodRange(BillingPeriodRange billingPeriodRange) {
        this.billingPeriodRange = billingPeriodRange;
    }

    /**
     * <p>
     * A time range for which the margin summary is effective. You can specify up to 12 months.
     * </p>
     * 
     * @return A time range for which the margin summary is effective. You can specify up to 12 months.
     */

    public BillingPeriodRange getBillingPeriodRange() {
        return this.billingPeriodRange;
    }

    /**
     * <p>
     * A time range for which the margin summary is effective. You can specify up to 12 months.
     * </p>
     * 
     * @param billingPeriodRange
     *        A time range for which the margin summary is effective. You can specify up to 12 months.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportRequest withBillingPeriodRange(BillingPeriodRange billingPeriodRange) {
        setBillingPeriodRange(billingPeriodRange);
        return this;
    }

    /**
     * <p>
     * A list of strings that specify the attributes that are used to break down costs in the margin summary reports for
     * the billing group. For example, you can view your costs by the Amazon Web Service name or the billing period.
     * </p>
     * 
     * @return A list of strings that specify the attributes that are used to break down costs in the margin summary
     *         reports for the billing group. For example, you can view your costs by the Amazon Web Service name or the
     *         billing period.
     * @see GroupByAttributeName
     */

    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * A list of strings that specify the attributes that are used to break down costs in the margin summary reports for
     * the billing group. For example, you can view your costs by the Amazon Web Service name or the billing period.
     * </p>
     * 
     * @param groupBy
     *        A list of strings that specify the attributes that are used to break down costs in the margin summary
     *        reports for the billing group. For example, you can view your costs by the Amazon Web Service name or the
     *        billing period.
     * @see GroupByAttributeName
     */

    public void setGroupBy(java.util.Collection<String> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<String>(groupBy);
    }

    /**
     * <p>
     * A list of strings that specify the attributes that are used to break down costs in the margin summary reports for
     * the billing group. For example, you can view your costs by the Amazon Web Service name or the billing period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        A list of strings that specify the attributes that are used to break down costs in the margin summary
     *        reports for the billing group. For example, you can view your costs by the Amazon Web Service name or the
     *        billing period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupByAttributeName
     */

    public GetBillingGroupCostReportRequest withGroupBy(String... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<String>(groupBy.length));
        }
        for (String ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strings that specify the attributes that are used to break down costs in the margin summary reports for
     * the billing group. For example, you can view your costs by the Amazon Web Service name or the billing period.
     * </p>
     * 
     * @param groupBy
     *        A list of strings that specify the attributes that are used to break down costs in the margin summary
     *        reports for the billing group. For example, you can view your costs by the Amazon Web Service name or the
     *        billing period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupByAttributeName
     */

    public GetBillingGroupCostReportRequest withGroupBy(java.util.Collection<String> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * A list of strings that specify the attributes that are used to break down costs in the margin summary reports for
     * the billing group. For example, you can view your costs by the Amazon Web Service name or the billing period.
     * </p>
     * 
     * @param groupBy
     *        A list of strings that specify the attributes that are used to break down costs in the margin summary
     *        reports for the billing group. For example, you can view your costs by the Amazon Web Service name or the
     *        billing period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupByAttributeName
     */

    public GetBillingGroupCostReportRequest withGroupBy(GroupByAttributeName... groupBy) {
        java.util.ArrayList<String> groupByCopy = new java.util.ArrayList<String>(groupBy.length);
        for (GroupByAttributeName value : groupBy) {
            groupByCopy.add(value.toString());
        }
        if (getGroupBy() == null) {
            setGroupBy(groupByCopy);
        } else {
            getGroupBy().addAll(groupByCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of margin summary reports to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of margin summary reports to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of margin summary reports to retrieve.
     * </p>
     * 
     * @return The maximum number of margin summary reports to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of margin summary reports to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of margin summary reports to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used on subsequent calls to get reports.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     * 
     * @return The pagination token used on subsequent calls to get reports.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used on subsequent calls to get reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportRequest withNextToken(String nextToken) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBillingPeriodRange() != null)
            sb.append("BillingPeriodRange: ").append(getBillingPeriodRange()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
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

        if (obj instanceof GetBillingGroupCostReportRequest == false)
            return false;
        GetBillingGroupCostReportRequest other = (GetBillingGroupCostReportRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBillingPeriodRange() == null ^ this.getBillingPeriodRange() == null)
            return false;
        if (other.getBillingPeriodRange() != null && other.getBillingPeriodRange().equals(this.getBillingPeriodRange()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBillingPeriodRange() == null) ? 0 : getBillingPeriodRange().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBillingGroupCostReportRequest clone() {
        return (GetBillingGroupCostReportRequest) super.clone();
    }

}
