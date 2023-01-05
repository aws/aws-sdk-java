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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action the filter applies to matched findings.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The Amazon resource number (ARN) of the filter.
     * </p>
     */
    private java.util.List<String> arns;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The action the filter applies to matched findings.
     * </p>
     * 
     * @param action
     *        The action the filter applies to matched findings.
     * @see FilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action the filter applies to matched findings.
     * </p>
     * 
     * @return The action the filter applies to matched findings.
     * @see FilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action the filter applies to matched findings.
     * </p>
     * 
     * @param action
     *        The action the filter applies to matched findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public ListFiltersRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action the filter applies to matched findings.
     * </p>
     * 
     * @param action
     *        The action the filter applies to matched findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public ListFiltersRequest withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon resource number (ARN) of the filter.
     * </p>
     * 
     * @return The Amazon resource number (ARN) of the filter.
     */

    public java.util.List<String> getArns() {
        return arns;
    }

    /**
     * <p>
     * The Amazon resource number (ARN) of the filter.
     * </p>
     * 
     * @param arns
     *        The Amazon resource number (ARN) of the filter.
     */

    public void setArns(java.util.Collection<String> arns) {
        if (arns == null) {
            this.arns = null;
            return;
        }

        this.arns = new java.util.ArrayList<String>(arns);
    }

    /**
     * <p>
     * The Amazon resource number (ARN) of the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArns(java.util.Collection)} or {@link #withArns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param arns
     *        The Amazon resource number (ARN) of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withArns(String... arns) {
        if (this.arns == null) {
            setArns(new java.util.ArrayList<String>(arns.length));
        }
        for (String ele : arns) {
            this.arns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon resource number (ARN) of the filter.
     * </p>
     * 
     * @param arns
     *        The Amazon resource number (ARN) of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withArns(java.util.Collection<String> arns) {
        setArns(arns);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code>
     *         value returned from the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value returned from
     * the previous request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request to a list action. For subsequent calls, use the <code>NextToken</code> value
     *        returned from the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFiltersRequest withNextToken(String nextToken) {
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArns() != null)
            sb.append("Arns: ").append(getArns()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListFiltersRequest == false)
            return false;
        ListFiltersRequest other = (ListFiltersRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArns() == null ^ this.getArns() == null)
            return false;
        if (other.getArns() != null && other.getArns().equals(this.getArns()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArns() == null) ? 0 : getArns().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFiltersRequest clone() {
        return (ListFiltersRequest) super.clone();
    }

}
