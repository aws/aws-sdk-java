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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregateComplianceByConformancePacks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAggregateComplianceByConformancePacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Returns the <code>AggregateComplianceByConformancePack</code> object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregateComplianceByConformancePack> aggregateComplianceByConformancePacks;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the <code>AggregateComplianceByConformancePack</code> object.
     * </p>
     * 
     * @return Returns the <code>AggregateComplianceByConformancePack</code> object.
     */

    public java.util.List<AggregateComplianceByConformancePack> getAggregateComplianceByConformancePacks() {
        if (aggregateComplianceByConformancePacks == null) {
            aggregateComplianceByConformancePacks = new com.amazonaws.internal.SdkInternalList<AggregateComplianceByConformancePack>();
        }
        return aggregateComplianceByConformancePacks;
    }

    /**
     * <p>
     * Returns the <code>AggregateComplianceByConformancePack</code> object.
     * </p>
     * 
     * @param aggregateComplianceByConformancePacks
     *        Returns the <code>AggregateComplianceByConformancePack</code> object.
     */

    public void setAggregateComplianceByConformancePacks(java.util.Collection<AggregateComplianceByConformancePack> aggregateComplianceByConformancePacks) {
        if (aggregateComplianceByConformancePacks == null) {
            this.aggregateComplianceByConformancePacks = null;
            return;
        }

        this.aggregateComplianceByConformancePacks = new com.amazonaws.internal.SdkInternalList<AggregateComplianceByConformancePack>(
                aggregateComplianceByConformancePacks);
    }

    /**
     * <p>
     * Returns the <code>AggregateComplianceByConformancePack</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregateComplianceByConformancePacks(java.util.Collection)} or
     * {@link #withAggregateComplianceByConformancePacks(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param aggregateComplianceByConformancePacks
     *        Returns the <code>AggregateComplianceByConformancePack</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateComplianceByConformancePacksResult withAggregateComplianceByConformancePacks(
            AggregateComplianceByConformancePack... aggregateComplianceByConformancePacks) {
        if (this.aggregateComplianceByConformancePacks == null) {
            setAggregateComplianceByConformancePacks(new com.amazonaws.internal.SdkInternalList<AggregateComplianceByConformancePack>(
                    aggregateComplianceByConformancePacks.length));
        }
        for (AggregateComplianceByConformancePack ele : aggregateComplianceByConformancePacks) {
            this.aggregateComplianceByConformancePacks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the <code>AggregateComplianceByConformancePack</code> object.
     * </p>
     * 
     * @param aggregateComplianceByConformancePacks
     *        Returns the <code>AggregateComplianceByConformancePack</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateComplianceByConformancePacksResult withAggregateComplianceByConformancePacks(
            java.util.Collection<AggregateComplianceByConformancePack> aggregateComplianceByConformancePacks) {
        setAggregateComplianceByConformancePacks(aggregateComplianceByConformancePacks);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregateComplianceByConformancePacksResult withNextToken(String nextToken) {
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
        if (getAggregateComplianceByConformancePacks() != null)
            sb.append("AggregateComplianceByConformancePacks: ").append(getAggregateComplianceByConformancePacks()).append(",");
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

        if (obj instanceof DescribeAggregateComplianceByConformancePacksResult == false)
            return false;
        DescribeAggregateComplianceByConformancePacksResult other = (DescribeAggregateComplianceByConformancePacksResult) obj;
        if (other.getAggregateComplianceByConformancePacks() == null ^ this.getAggregateComplianceByConformancePacks() == null)
            return false;
        if (other.getAggregateComplianceByConformancePacks() != null
                && other.getAggregateComplianceByConformancePacks().equals(this.getAggregateComplianceByConformancePacks()) == false)
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

        hashCode = prime * hashCode + ((getAggregateComplianceByConformancePacks() == null) ? 0 : getAggregateComplianceByConformancePacks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAggregateComplianceByConformancePacksResult clone() {
        try {
            return (DescribeAggregateComplianceByConformancePacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
