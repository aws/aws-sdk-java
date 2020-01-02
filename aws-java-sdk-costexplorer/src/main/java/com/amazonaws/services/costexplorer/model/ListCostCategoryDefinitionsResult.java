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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ListCostCategoryDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCostCategoryDefinitionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify the Cost Category.
     * </p>
     */
    private java.util.List<CostCategoryReference> costCategoryReferences;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify the Cost Category.
     * </p>
     * 
     * @return A reference to a Cost Category containing enough information to identify the Cost Category.
     */

    public java.util.List<CostCategoryReference> getCostCategoryReferences() {
        return costCategoryReferences;
    }

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify the Cost Category.
     * </p>
     * 
     * @param costCategoryReferences
     *        A reference to a Cost Category containing enough information to identify the Cost Category.
     */

    public void setCostCategoryReferences(java.util.Collection<CostCategoryReference> costCategoryReferences) {
        if (costCategoryReferences == null) {
            this.costCategoryReferences = null;
            return;
        }

        this.costCategoryReferences = new java.util.ArrayList<CostCategoryReference>(costCategoryReferences);
    }

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify the Cost Category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCostCategoryReferences(java.util.Collection)} or
     * {@link #withCostCategoryReferences(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param costCategoryReferences
     *        A reference to a Cost Category containing enough information to identify the Cost Category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostCategoryDefinitionsResult withCostCategoryReferences(CostCategoryReference... costCategoryReferences) {
        if (this.costCategoryReferences == null) {
            setCostCategoryReferences(new java.util.ArrayList<CostCategoryReference>(costCategoryReferences.length));
        }
        for (CostCategoryReference ele : costCategoryReferences) {
            this.costCategoryReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A reference to a Cost Category containing enough information to identify the Cost Category.
     * </p>
     * 
     * @param costCategoryReferences
     *        A reference to a Cost Category containing enough information to identify the Cost Category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCostCategoryDefinitionsResult withCostCategoryReferences(java.util.Collection<CostCategoryReference> costCategoryReferences) {
        setCostCategoryReferences(costCategoryReferences);
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

    public ListCostCategoryDefinitionsResult withNextToken(String nextToken) {
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
        if (getCostCategoryReferences() != null)
            sb.append("CostCategoryReferences: ").append(getCostCategoryReferences()).append(",");
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

        if (obj instanceof ListCostCategoryDefinitionsResult == false)
            return false;
        ListCostCategoryDefinitionsResult other = (ListCostCategoryDefinitionsResult) obj;
        if (other.getCostCategoryReferences() == null ^ this.getCostCategoryReferences() == null)
            return false;
        if (other.getCostCategoryReferences() != null && other.getCostCategoryReferences().equals(this.getCostCategoryReferences()) == false)
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

        hashCode = prime * hashCode + ((getCostCategoryReferences() == null) ? 0 : getCostCategoryReferences().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCostCategoryDefinitionsResult clone() {
        try {
            return (ListCostCategoryDefinitionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
