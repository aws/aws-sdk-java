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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTablesByLFTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * </p>
     */
    private java.util.List<LFTag> expression;

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesByLFTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesByLFTagsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesByLFTagsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * </p>
     * 
     * @return A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     */

    public java.util.List<LFTag> getExpression() {
        return expression;
    }

    /**
     * <p>
     * A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * </p>
     * 
     * @param expression
     *        A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     */

    public void setExpression(java.util.Collection<LFTag> expression) {
        if (expression == null) {
            this.expression = null;
            return;
        }

        this.expression = new java.util.ArrayList<LFTag>(expression);
    }

    /**
     * <p>
     * A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExpression(java.util.Collection)} or {@link #withExpression(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param expression
     *        A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesByLFTagsRequest withExpression(LFTag... expression) {
        if (this.expression == null) {
            setExpression(new java.util.ArrayList<LFTag>(expression.length));
        }
        for (LFTag ele : expression) {
            this.expression.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * </p>
     * 
     * @param expression
     *        A list of conditions (<code>LFTag</code> structures) to search for in table resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchTablesByLFTagsRequest withExpression(java.util.Collection<LFTag> expression) {
        setExpression(expression);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchTablesByLFTagsRequest == false)
            return false;
        SearchTablesByLFTagsRequest other = (SearchTablesByLFTagsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public SearchTablesByLFTagsRequest clone() {
        return (SearchTablesByLFTagsRequest) super.clone();
    }

}
