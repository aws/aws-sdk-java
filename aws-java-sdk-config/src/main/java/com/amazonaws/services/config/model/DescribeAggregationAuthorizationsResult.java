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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeAggregationAuthorizations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAggregationAuthorizationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AggregationAuthorization> aggregationAuthorizations;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @return Returns a list of authorizations granted to various aggregator accounts and regions.
     */

    public java.util.List<AggregationAuthorization> getAggregationAuthorizations() {
        if (aggregationAuthorizations == null) {
            aggregationAuthorizations = new com.amazonaws.internal.SdkInternalList<AggregationAuthorization>();
        }
        return aggregationAuthorizations;
    }

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @param aggregationAuthorizations
     *        Returns a list of authorizations granted to various aggregator accounts and regions.
     */

    public void setAggregationAuthorizations(java.util.Collection<AggregationAuthorization> aggregationAuthorizations) {
        if (aggregationAuthorizations == null) {
            this.aggregationAuthorizations = null;
            return;
        }

        this.aggregationAuthorizations = new com.amazonaws.internal.SdkInternalList<AggregationAuthorization>(aggregationAuthorizations);
    }

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregationAuthorizations(java.util.Collection)} or
     * {@link #withAggregationAuthorizations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param aggregationAuthorizations
     *        Returns a list of authorizations granted to various aggregator accounts and regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregationAuthorizationsResult withAggregationAuthorizations(AggregationAuthorization... aggregationAuthorizations) {
        if (this.aggregationAuthorizations == null) {
            setAggregationAuthorizations(new com.amazonaws.internal.SdkInternalList<AggregationAuthorization>(aggregationAuthorizations.length));
        }
        for (AggregationAuthorization ele : aggregationAuthorizations) {
            this.aggregationAuthorizations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of authorizations granted to various aggregator accounts and regions.
     * </p>
     * 
     * @param aggregationAuthorizations
     *        Returns a list of authorizations granted to various aggregator accounts and regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAggregationAuthorizationsResult withAggregationAuthorizations(java.util.Collection<AggregationAuthorization> aggregationAuthorizations) {
        setAggregationAuthorizations(aggregationAuthorizations);
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

    public DescribeAggregationAuthorizationsResult withNextToken(String nextToken) {
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
        if (getAggregationAuthorizations() != null)
            sb.append("AggregationAuthorizations: ").append(getAggregationAuthorizations()).append(",");
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

        if (obj instanceof DescribeAggregationAuthorizationsResult == false)
            return false;
        DescribeAggregationAuthorizationsResult other = (DescribeAggregationAuthorizationsResult) obj;
        if (other.getAggregationAuthorizations() == null ^ this.getAggregationAuthorizations() == null)
            return false;
        if (other.getAggregationAuthorizations() != null && other.getAggregationAuthorizations().equals(this.getAggregationAuthorizations()) == false)
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

        hashCode = prime * hashCode + ((getAggregationAuthorizations() == null) ? 0 : getAggregationAuthorizations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAggregationAuthorizationsResult clone() {
        try {
            return (DescribeAggregationAuthorizationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
