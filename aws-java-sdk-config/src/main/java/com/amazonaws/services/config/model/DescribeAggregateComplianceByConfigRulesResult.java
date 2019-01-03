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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConfigRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAggregateComplianceByConfigRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Returns a list of AggregateComplianceByConfigRule object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregateComplianceByConfigRule> aggregateComplianceByConfigRules;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of AggregateComplianceByConfigRule object.
     * </p>
     * 
     * @return Returns a list of AggregateComplianceByConfigRule object.
     */

    public java.util.List<AggregateComplianceByConfigRule> getAggregateComplianceByConfigRules() {
        if (aggregateComplianceByConfigRules == null) {
            aggregateComplianceByConfigRules = new com.amazonaws.internal.SdkInternalList<AggregateComplianceByConfigRule>();
        }
        return aggregateComplianceByConfigRules;
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceByConfigRule object.
     * </p>
     * 
     * @param aggregateComplianceByConfigRules
     *        Returns a list of AggregateComplianceByConfigRule object.
     */

    public void setAggregateComplianceByConfigRules(java.util.Collection<AggregateComplianceByConfigRule> aggregateComplianceByConfigRules) {
        if (aggregateComplianceByConfigRules == null) {
            this.aggregateComplianceByConfigRules = null;
            return;
        }

        this.aggregateComplianceByConfigRules = new com.amazonaws.internal.SdkInternalList<AggregateComplianceByConfigRule>(aggregateComplianceByConfigRules);
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceByConfigRule object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregateComplianceByConfigRules(java.util.Collection)} or
     * {@link #withAggregateComplianceByConfigRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param aggregateComplianceByConfigRules
     *        Returns a list of AggregateComplianceByConfigRule object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateComplianceByConfigRulesResult withAggregateComplianceByConfigRules(
            AggregateComplianceByConfigRule... aggregateComplianceByConfigRules) {
        if (this.aggregateComplianceByConfigRules == null) {
            setAggregateComplianceByConfigRules(new com.amazonaws.internal.SdkInternalList<AggregateComplianceByConfigRule>(
                    aggregateComplianceByConfigRules.length));
        }
        for (AggregateComplianceByConfigRule ele : aggregateComplianceByConfigRules) {
            this.aggregateComplianceByConfigRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of AggregateComplianceByConfigRule object.
     * </p>
     * 
     * @param aggregateComplianceByConfigRules
     *        Returns a list of AggregateComplianceByConfigRule object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateComplianceByConfigRulesResult withAggregateComplianceByConfigRules(
            java.util.Collection<AggregateComplianceByConfigRule> aggregateComplianceByConfigRules) {
        setAggregateComplianceByConfigRules(aggregateComplianceByConfigRules);
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

    public DescribeAggregateComplianceByConfigRulesResult withNextToken(String nextToken) {
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
        if (getAggregateComplianceByConfigRules() != null)
            sb.append("AggregateComplianceByConfigRules: ").append(getAggregateComplianceByConfigRules()).append(",");
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

        if (obj instanceof DescribeAggregateComplianceByConfigRulesResult == false)
            return false;
        DescribeAggregateComplianceByConfigRulesResult other = (DescribeAggregateComplianceByConfigRulesResult) obj;
        if (other.getAggregateComplianceByConfigRules() == null ^ this.getAggregateComplianceByConfigRules() == null)
            return false;
        if (other.getAggregateComplianceByConfigRules() != null
                && other.getAggregateComplianceByConfigRules().equals(this.getAggregateComplianceByConfigRules()) == false)
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

        hashCode = prime * hashCode + ((getAggregateComplianceByConfigRules() == null) ? 0 : getAggregateComplianceByConfigRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAggregateComplianceByConfigRulesResult clone() {
        try {
            return (DescribeAggregateComplianceByConfigRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
