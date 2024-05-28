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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/BatchGetSecretValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSecretValueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or <code>SecretIdList</code>,
     * but not both.
     * </p>
     */
    private java.util.List<String> secretIdList;
    /**
     * <p>
     * The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     * <code>SecretIdList</code>, but not both.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>BatchGetSecretValue</code> again with the value from <code>NextToken</code>. To use this
     * parameter, you must also use the <code>Filters</code> parameter.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or <code>SecretIdList</code>,
     * but not both.
     * </p>
     * 
     * @return The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or
     *         <code>SecretIdList</code>, but not both.
     */

    public java.util.List<String> getSecretIdList() {
        return secretIdList;
    }

    /**
     * <p>
     * The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or <code>SecretIdList</code>,
     * but not both.
     * </p>
     * 
     * @param secretIdList
     *        The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or
     *        <code>SecretIdList</code>, but not both.
     */

    public void setSecretIdList(java.util.Collection<String> secretIdList) {
        if (secretIdList == null) {
            this.secretIdList = null;
            return;
        }

        this.secretIdList = new java.util.ArrayList<String>(secretIdList);
    }

    /**
     * <p>
     * The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or <code>SecretIdList</code>,
     * but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretIdList(java.util.Collection)} or {@link #withSecretIdList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param secretIdList
     *        The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or
     *        <code>SecretIdList</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueRequest withSecretIdList(String... secretIdList) {
        if (this.secretIdList == null) {
            setSecretIdList(new java.util.ArrayList<String>(secretIdList.length));
        }
        for (String ele : secretIdList) {
            this.secretIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or <code>SecretIdList</code>,
     * but not both.
     * </p>
     * 
     * @param secretIdList
     *        The ARN or names of the secrets to retrieve. You must include <code>Filters</code> or
     *        <code>SecretIdList</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueRequest withSecretIdList(java.util.Collection<String> secretIdList) {
        setSecretIdList(secretIdList);
        return this;
    }

    /**
     * <p>
     * The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     * <code>SecretIdList</code>, but not both.
     * </p>
     * 
     * @return The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     *         <code>SecretIdList</code>, but not both.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     * <code>SecretIdList</code>, but not both.
     * </p>
     * 
     * @param filters
     *        The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     *        <code>SecretIdList</code>, but not both.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     * <code>SecretIdList</code>, but not both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     *        <code>SecretIdList</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     * <code>SecretIdList</code>, but not both.
     * </p>
     * 
     * @param filters
     *        The filters to choose which secrets to retrieve. You must include <code>Filters</code> or
     *        <code>SecretIdList</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>BatchGetSecretValue</code> again with the value from <code>NextToken</code>. To use this
     * parameter, you must also use the <code>Filters</code> parameter.
     * </p>
     * 
     * @param maxResults
     *        The number of results to include in the response.</p>
     *        <p>
     *        If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *        get the next results, call <code>BatchGetSecretValue</code> again with the value from
     *        <code>NextToken</code>. To use this parameter, you must also use the <code>Filters</code> parameter.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>BatchGetSecretValue</code> again with the value from <code>NextToken</code>. To use this
     * parameter, you must also use the <code>Filters</code> parameter.
     * </p>
     * 
     * @return The number of results to include in the response.</p>
     *         <p>
     *         If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *         get the next results, call <code>BatchGetSecretValue</code> again with the value from
     *         <code>NextToken</code>. To use this parameter, you must also use the <code>Filters</code> parameter.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of results to include in the response.
     * </p>
     * <p>
     * If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To get the
     * next results, call <code>BatchGetSecretValue</code> again with the value from <code>NextToken</code>. To use this
     * parameter, you must also use the <code>Filters</code> parameter.
     * </p>
     * 
     * @param maxResults
     *        The number of results to include in the response.</p>
     *        <p>
     *        If there are more results available, in the response, Secrets Manager includes <code>NextToken</code>. To
     *        get the next results, call <code>BatchGetSecretValue</code> again with the value from
     *        <code>NextToken</code>. To use this parameter, you must also use the <code>Filters</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous call did not show all results.
     *        To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     * 
     * @return A token that indicates where the output should continue from, if a previous call did not show all
     *         results. To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates where the output should continue from, if a previous call did not show all results. To get
     * the next results, call <code>BatchGetSecretValue</code> again with this value.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates where the output should continue from, if a previous call did not show all results.
     *        To get the next results, call <code>BatchGetSecretValue</code> again with this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSecretValueRequest withNextToken(String nextToken) {
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
        if (getSecretIdList() != null)
            sb.append("SecretIdList: ").append(getSecretIdList()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof BatchGetSecretValueRequest == false)
            return false;
        BatchGetSecretValueRequest other = (BatchGetSecretValueRequest) obj;
        if (other.getSecretIdList() == null ^ this.getSecretIdList() == null)
            return false;
        if (other.getSecretIdList() != null && other.getSecretIdList().equals(this.getSecretIdList()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getSecretIdList() == null) ? 0 : getSecretIdList().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSecretValueRequest clone() {
        return (BatchGetSecretValueRequest) super.clone();
    }

}
