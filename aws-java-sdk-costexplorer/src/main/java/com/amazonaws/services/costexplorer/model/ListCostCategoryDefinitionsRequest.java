/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostCategoryDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCostCategoryDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     */
    private String effectiveOn;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * <p>
     * You can use this information to retrieve the full Cost Category information using
     * <code>DescribeCostCategory</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     * 
     * @param effectiveOn
     *        The date when the Cost Category was effective.
     */

    public void setEffectiveOn(String effectiveOn) {
        this.effectiveOn = effectiveOn;
    }

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     * 
     * @return The date when the Cost Category was effective.
     */

    public String getEffectiveOn() {
        return this.effectiveOn;
    }

    /**
     * <p>
     * The date when the Cost Category was effective.
     * </p>
     * 
     * @param effectiveOn
     *        The date when the Cost Category was effective.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostCategoryDefinitionsRequest withEffectiveOn(String effectiveOn) {
        setEffectiveOn(effectiveOn);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * <p>
     * You can use this information to retrieve the full Cost Category information using
     * <code>DescribeCostCategory</code>.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size. </p>
     *        <p>
     *        You can use this information to retrieve the full Cost Category information using
     *        <code>DescribeCostCategory</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * <p>
     * You can use this information to retrieve the full Cost Category information using
     * <code>DescribeCostCategory</code>.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size. </p>
     *         <p>
     *         You can use this information to retrieve the full Cost Category information using
     *         <code>DescribeCostCategory</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * <p>
     * You can use this information to retrieve the full Cost Category information using
     * <code>DescribeCostCategory</code>.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size. </p>
     *        <p>
     *        You can use this information to retrieve the full Cost Category information using
     *        <code>DescribeCostCategory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostCategoryDefinitionsRequest withNextToken(String nextToken) {
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
        if (getEffectiveOn() != null)
            sb.append("EffectiveOn: ").append(getEffectiveOn()).append(",");
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

        if (obj instanceof ListCostCategoryDefinitionsRequest == false)
            return false;
        ListCostCategoryDefinitionsRequest other = (ListCostCategoryDefinitionsRequest) obj;
        if (other.getEffectiveOn() == null ^ this.getEffectiveOn() == null)
            return false;
        if (other.getEffectiveOn() != null && other.getEffectiveOn().equals(this.getEffectiveOn()) == false)
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

        hashCode = prime * hashCode + ((getEffectiveOn() == null) ? 0 : getEffectiveOn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCostCategoryDefinitionsRequest clone() {
        return (ListCostCategoryDefinitionsRequest) super.clone();
    }

}
