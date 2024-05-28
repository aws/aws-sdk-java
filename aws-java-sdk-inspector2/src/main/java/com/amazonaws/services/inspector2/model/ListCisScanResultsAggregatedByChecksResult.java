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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScanResultsAggregatedByChecks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScanResultsAggregatedByChecksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The check aggregations.
     * </p>
     */
    private java.util.List<CisCheckAggregation> checkAggregations;
    /**
     * <p>
     * The pagination token from a previous request that's used to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The check aggregations.
     * </p>
     * 
     * @return The check aggregations.
     */

    public java.util.List<CisCheckAggregation> getCheckAggregations() {
        return checkAggregations;
    }

    /**
     * <p>
     * The check aggregations.
     * </p>
     * 
     * @param checkAggregations
     *        The check aggregations.
     */

    public void setCheckAggregations(java.util.Collection<CisCheckAggregation> checkAggregations) {
        if (checkAggregations == null) {
            this.checkAggregations = null;
            return;
        }

        this.checkAggregations = new java.util.ArrayList<CisCheckAggregation>(checkAggregations);
    }

    /**
     * <p>
     * The check aggregations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckAggregations(java.util.Collection)} or {@link #withCheckAggregations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param checkAggregations
     *        The check aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanResultsAggregatedByChecksResult withCheckAggregations(CisCheckAggregation... checkAggregations) {
        if (this.checkAggregations == null) {
            setCheckAggregations(new java.util.ArrayList<CisCheckAggregation>(checkAggregations.length));
        }
        for (CisCheckAggregation ele : checkAggregations) {
            this.checkAggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The check aggregations.
     * </p>
     * 
     * @param checkAggregations
     *        The check aggregations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanResultsAggregatedByChecksResult withCheckAggregations(java.util.Collection<CisCheckAggregation> checkAggregations) {
        setCheckAggregations(checkAggregations);
        return this;
    }

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

    public ListCisScanResultsAggregatedByChecksResult withNextToken(String nextToken) {
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
        if (getCheckAggregations() != null)
            sb.append("CheckAggregations: ").append(getCheckAggregations()).append(",");
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

        if (obj instanceof ListCisScanResultsAggregatedByChecksResult == false)
            return false;
        ListCisScanResultsAggregatedByChecksResult other = (ListCisScanResultsAggregatedByChecksResult) obj;
        if (other.getCheckAggregations() == null ^ this.getCheckAggregations() == null)
            return false;
        if (other.getCheckAggregations() != null && other.getCheckAggregations().equals(this.getCheckAggregations()) == false)
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

        hashCode = prime * hashCode + ((getCheckAggregations() == null) ? 0 : getCheckAggregations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCisScanResultsAggregatedByChecksResult clone() {
        try {
            return (ListCisScanResultsAggregatedByChecksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
