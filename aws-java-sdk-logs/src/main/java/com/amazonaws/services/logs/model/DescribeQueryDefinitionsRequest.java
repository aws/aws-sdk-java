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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeQueryDefinitions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQueryDefinitionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter to filter your results to only the query definitions that have names that start with the
     * prefix you specify.
     * </p>
     */
    private String queryDefinitionNamePrefix;
    /**
     * <p>
     * Limits the number of returned query definitions to the specified number.
     * </p>
     */
    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * Use this parameter to filter your results to only the query definitions that have names that start with the
     * prefix you specify.
     * </p>
     * 
     * @param queryDefinitionNamePrefix
     *        Use this parameter to filter your results to only the query definitions that have names that start with
     *        the prefix you specify.
     */

    public void setQueryDefinitionNamePrefix(String queryDefinitionNamePrefix) {
        this.queryDefinitionNamePrefix = queryDefinitionNamePrefix;
    }

    /**
     * <p>
     * Use this parameter to filter your results to only the query definitions that have names that start with the
     * prefix you specify.
     * </p>
     * 
     * @return Use this parameter to filter your results to only the query definitions that have names that start with
     *         the prefix you specify.
     */

    public String getQueryDefinitionNamePrefix() {
        return this.queryDefinitionNamePrefix;
    }

    /**
     * <p>
     * Use this parameter to filter your results to only the query definitions that have names that start with the
     * prefix you specify.
     * </p>
     * 
     * @param queryDefinitionNamePrefix
     *        Use this parameter to filter your results to only the query definitions that have names that start with
     *        the prefix you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryDefinitionsRequest withQueryDefinitionNamePrefix(String queryDefinitionNamePrefix) {
        setQueryDefinitionNamePrefix(queryDefinitionNamePrefix);
        return this;
    }

    /**
     * <p>
     * Limits the number of returned query definitions to the specified number.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of returned query definitions to the specified number.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits the number of returned query definitions to the specified number.
     * </p>
     * 
     * @return Limits the number of returned query definitions to the specified number.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limits the number of returned query definitions to the specified number.
     * </p>
     * 
     * @param maxResults
     *        Limits the number of returned query definitions to the specified number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryDefinitionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQueryDefinitionsRequest withNextToken(String nextToken) {
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
        if (getQueryDefinitionNamePrefix() != null)
            sb.append("QueryDefinitionNamePrefix: ").append(getQueryDefinitionNamePrefix()).append(",");
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

        if (obj instanceof DescribeQueryDefinitionsRequest == false)
            return false;
        DescribeQueryDefinitionsRequest other = (DescribeQueryDefinitionsRequest) obj;
        if (other.getQueryDefinitionNamePrefix() == null ^ this.getQueryDefinitionNamePrefix() == null)
            return false;
        if (other.getQueryDefinitionNamePrefix() != null && other.getQueryDefinitionNamePrefix().equals(this.getQueryDefinitionNamePrefix()) == false)
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

        hashCode = prime * hashCode + ((getQueryDefinitionNamePrefix() == null) ? 0 : getQueryDefinitionNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQueryDefinitionsRequest clone() {
        return (DescribeQueryDefinitionsRequest) super.clone();
    }

}
