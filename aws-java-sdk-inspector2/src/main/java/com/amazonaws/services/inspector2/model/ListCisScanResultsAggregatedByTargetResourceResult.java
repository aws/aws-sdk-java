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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScanResultsAggregatedByTargetResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScanResultsAggregatedByTargetResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The resource aggregations.
     * </p>
     */
    private java.util.List<CisTargetResourceAggregation> targetResourceAggregations;

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @return The pagination token from a previous request that's used to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from a previous request that's used to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanResultsAggregatedByTargetResourceResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The resource aggregations.
     * </p>
     * 
     * @return The resource aggregations.
     */

    public java.util.List<CisTargetResourceAggregation> getTargetResourceAggregations() {
        return targetResourceAggregations;
    }

    /**
     * <p>
     * The resource aggregations.
     * </p>
     * 
     * @param targetResourceAggregations
     *        The resource aggregations.
     */

    public void setTargetResourceAggregations(java.util.Collection<CisTargetResourceAggregation> targetResourceAggregations) {
        if (targetResourceAggregations == null) {
            this.targetResourceAggregations = null;
            return;
        }

        this.targetResourceAggregations = new java.util.ArrayList<CisTargetResourceAggregation>(targetResourceAggregations);
    }

    /**
     * <p>
     * The resource aggregations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceAggregations(java.util.Collection)} or
     * {@link #withTargetResourceAggregations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceAggregations
     *        The resource aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanResultsAggregatedByTargetResourceResult withTargetResourceAggregations(CisTargetResourceAggregation... targetResourceAggregations) {
        if (this.targetResourceAggregations == null) {
            setTargetResourceAggregations(new java.util.ArrayList<CisTargetResourceAggregation>(targetResourceAggregations.length));
        }
        for (CisTargetResourceAggregation ele : targetResourceAggregations) {
            this.targetResourceAggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource aggregations.
     * </p>
     * 
     * @param targetResourceAggregations
     *        The resource aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanResultsAggregatedByTargetResourceResult withTargetResourceAggregations(
            java.util.Collection<CisTargetResourceAggregation> targetResourceAggregations) {
        setTargetResourceAggregations(targetResourceAggregations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTargetResourceAggregations() != null)
            sb.append("TargetResourceAggregations: ").append(getTargetResourceAggregations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCisScanResultsAggregatedByTargetResourceResult == false)
            return false;
        ListCisScanResultsAggregatedByTargetResourceResult other = (ListCisScanResultsAggregatedByTargetResourceResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTargetResourceAggregations() == null ^ this.getTargetResourceAggregations() == null)
            return false;
        if (other.getTargetResourceAggregations() != null && other.getTargetResourceAggregations().equals(this.getTargetResourceAggregations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceAggregations() == null) ? 0 : getTargetResourceAggregations().hashCode());
        return hashCode;
    }

    @Override
    public ListCisScanResultsAggregatedByTargetResourceResult clone() {
        try {
            return (ListCisScanResultsAggregatedByTargetResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
