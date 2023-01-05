/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostAllocationTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCostAllocationTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of cost allocation tags that includes the detailed metadata for each one.
     * </p>
     */
    private java.util.List<CostAllocationTag> costAllocationTags;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of cost allocation tags that includes the detailed metadata for each one.
     * </p>
     * 
     * @return A list of cost allocation tags that includes the detailed metadata for each one.
     */

    public java.util.List<CostAllocationTag> getCostAllocationTags() {
        return costAllocationTags;
    }

    /**
     * <p>
     * A list of cost allocation tags that includes the detailed metadata for each one.
     * </p>
     * 
     * @param costAllocationTags
     *        A list of cost allocation tags that includes the detailed metadata for each one.
     */

    public void setCostAllocationTags(java.util.Collection<CostAllocationTag> costAllocationTags) {
        if (costAllocationTags == null) {
            this.costAllocationTags = null;
            return;
        }

        this.costAllocationTags = new java.util.ArrayList<CostAllocationTag>(costAllocationTags);
    }

    /**
     * <p>
     * A list of cost allocation tags that includes the detailed metadata for each one.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCostAllocationTags(java.util.Collection)} or {@link #withCostAllocationTags(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param costAllocationTags
     *        A list of cost allocation tags that includes the detailed metadata for each one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsResult withCostAllocationTags(CostAllocationTag... costAllocationTags) {
        if (this.costAllocationTags == null) {
            setCostAllocationTags(new java.util.ArrayList<CostAllocationTag>(costAllocationTags.length));
        }
        for (CostAllocationTag ele : costAllocationTags) {
            this.costAllocationTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags that includes the detailed metadata for each one.
     * </p>
     * 
     * @param costAllocationTags
     *        A list of cost allocation tags that includes the detailed metadata for each one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsResult withCostAllocationTags(java.util.Collection<CostAllocationTag> costAllocationTags) {
        setCostAllocationTags(costAllocationTags);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostAllocationTagsResult withNextToken(String nextToken) {
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
        if (getCostAllocationTags() != null)
            sb.append("CostAllocationTags: ").append(getCostAllocationTags()).append(",");
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

        if (obj instanceof ListCostAllocationTagsResult == false)
            return false;
        ListCostAllocationTagsResult other = (ListCostAllocationTagsResult) obj;
        if (other.getCostAllocationTags() == null ^ this.getCostAllocationTags() == null)
            return false;
        if (other.getCostAllocationTags() != null && other.getCostAllocationTags().equals(this.getCostAllocationTags()) == false)
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

        hashCode = prime * hashCode + ((getCostAllocationTags() == null) ? 0 : getCostAllocationTags().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCostAllocationTagsResult clone() {
        try {
            return (ListCostAllocationTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
