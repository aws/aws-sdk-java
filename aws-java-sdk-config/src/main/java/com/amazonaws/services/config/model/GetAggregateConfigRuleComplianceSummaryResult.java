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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateConfigRuleComplianceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateConfigRuleComplianceSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Groups the result based on ACCOUNT_ID or AWS_REGION.
     * </p>
     */
    private String groupByKey;
    /**
     * <p>
     * Returns a list of AggregateComplianceCounts object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregateComplianceCount> aggregateComplianceCounts;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Groups the result based on ACCOUNT_ID or AWS_REGION.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on ACCOUNT_ID or AWS_REGION.
     */

    public void setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
    }

    /**
     * <p>
     * Groups the result based on ACCOUNT_ID or AWS_REGION.
     * </p>
     * 
     * @return Groups the result based on ACCOUNT_ID or AWS_REGION.
     */

    public String getGroupByKey() {
        return this.groupByKey;
    }

    /**
     * <p>
     * Groups the result based on ACCOUNT_ID or AWS_REGION.
     * </p>
     * 
     * @param groupByKey
     *        Groups the result based on ACCOUNT_ID or AWS_REGION.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConfigRuleComplianceSummaryResult withGroupByKey(String groupByKey) {
        setGroupByKey(groupByKey);
        return this;
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceCounts object.
     * </p>
     * 
     * @return Returns a list of AggregateComplianceCounts object.
     */

    public java.util.List<AggregateComplianceCount> getAggregateComplianceCounts() {
        if (aggregateComplianceCounts == null) {
            aggregateComplianceCounts = new com.amazonaws.internal.SdkInternalList<AggregateComplianceCount>();
        }
        return aggregateComplianceCounts;
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceCounts object.
     * </p>
     * 
     * @param aggregateComplianceCounts
     *        Returns a list of AggregateComplianceCounts object.
     */

    public void setAggregateComplianceCounts(java.util.Collection<AggregateComplianceCount> aggregateComplianceCounts) {
        if (aggregateComplianceCounts == null) {
            this.aggregateComplianceCounts = null;
            return;
        }

        this.aggregateComplianceCounts = new com.amazonaws.internal.SdkInternalList<AggregateComplianceCount>(aggregateComplianceCounts);
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceCounts object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregateComplianceCounts(java.util.Collection)} or
     * {@link #withAggregateComplianceCounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param aggregateComplianceCounts
     *        Returns a list of AggregateComplianceCounts object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConfigRuleComplianceSummaryResult withAggregateComplianceCounts(AggregateComplianceCount... aggregateComplianceCounts) {
        if (this.aggregateComplianceCounts == null) {
            setAggregateComplianceCounts(new com.amazonaws.internal.SdkInternalList<AggregateComplianceCount>(aggregateComplianceCounts.length));
        }
        for (AggregateComplianceCount ele : aggregateComplianceCounts) {
            this.aggregateComplianceCounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceCounts object.
     * </p>
     * 
     * @param aggregateComplianceCounts
     *        Returns a list of AggregateComplianceCounts object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConfigRuleComplianceSummaryResult withAggregateComplianceCounts(java.util.Collection<AggregateComplianceCount> aggregateComplianceCounts) {
        setAggregateComplianceCounts(aggregateComplianceCounts);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateConfigRuleComplianceSummaryResult withNextToken(String nextToken) {
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
        if (getGroupByKey() != null)
            sb.append("GroupByKey: ").append(getGroupByKey()).append(",");
        if (getAggregateComplianceCounts() != null)
            sb.append("AggregateComplianceCounts: ").append(getAggregateComplianceCounts()).append(",");
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

        if (obj instanceof GetAggregateConfigRuleComplianceSummaryResult == false)
            return false;
        GetAggregateConfigRuleComplianceSummaryResult other = (GetAggregateConfigRuleComplianceSummaryResult) obj;
        if (other.getGroupByKey() == null ^ this.getGroupByKey() == null)
            return false;
        if (other.getGroupByKey() != null && other.getGroupByKey().equals(this.getGroupByKey()) == false)
            return false;
        if (other.getAggregateComplianceCounts() == null ^ this.getAggregateComplianceCounts() == null)
            return false;
        if (other.getAggregateComplianceCounts() != null && other.getAggregateComplianceCounts().equals(this.getAggregateComplianceCounts()) == false)
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

        hashCode = prime * hashCode + ((getGroupByKey() == null) ? 0 : getGroupByKey().hashCode());
        hashCode = prime * hashCode + ((getAggregateComplianceCounts() == null) ? 0 : getAggregateComplianceCounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateConfigRuleComplianceSummaryResult clone() {
        try {
            return (GetAggregateConfigRuleComplianceSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
