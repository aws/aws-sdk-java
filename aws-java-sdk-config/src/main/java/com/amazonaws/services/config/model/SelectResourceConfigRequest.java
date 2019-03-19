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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/SelectResourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectResourceConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The SQL query <code>SELECT</code> command.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The maximum number of query results returned on each page.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The SQL query <code>SELECT</code> command.
     * </p>
     * 
     * @param expression
     *        The SQL query <code>SELECT</code> command.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The SQL query <code>SELECT</code> command.
     * </p>
     * 
     * @return The SQL query <code>SELECT</code> command.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The SQL query <code>SELECT</code> command.
     * </p>
     * 
     * @param expression
     *        The SQL query <code>SELECT</code> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigRequest withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The maximum number of query results returned on each page.
     * </p>
     * 
     * @param limit
     *        The maximum number of query results returned on each page.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of query results returned on each page.
     * </p>
     * 
     * @return The maximum number of query results returned on each page.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of query results returned on each page.
     * </p>
     * 
     * @param limit
     *        The maximum number of query results returned on each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectResourceConfigRequest withNextToken(String nextToken) {
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof SelectResourceConfigRequest == false)
            return false;
        SelectResourceConfigRequest other = (SelectResourceConfigRequest) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SelectResourceConfigRequest clone() {
        return (SelectResourceConfigRequest) super.clone();
    }

}
