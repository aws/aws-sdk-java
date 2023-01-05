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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListDataQualityRulesetEvaluationRuns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDataQualityRulesetEvaluationRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filter criteria.
     * </p>
     */
    private DataQualityRulesetEvaluationRunFilter filter;
    /**
     * <p>
     * A paginated token to offset the results.
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
     * The filter criteria.
     * </p>
     * 
     * @param filter
     *        The filter criteria.
     */

    public void setFilter(DataQualityRulesetEvaluationRunFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter criteria.
     * </p>
     * 
     * @return The filter criteria.
     */

    public DataQualityRulesetEvaluationRunFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter criteria.
     * </p>
     * 
     * @param filter
     *        The filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityRulesetEvaluationRunsRequest withFilter(DataQualityRulesetEvaluationRunFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * 
     * @param nextToken
     *        A paginated token to offset the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * 
     * @return A paginated token to offset the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A paginated token to offset the results.
     * </p>
     * 
     * @param nextToken
     *        A paginated token to offset the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDataQualityRulesetEvaluationRunsRequest withNextToken(String nextToken) {
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

    public ListDataQualityRulesetEvaluationRunsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataQualityRulesetEvaluationRunsRequest == false)
            return false;
        ListDataQualityRulesetEvaluationRunsRequest other = (ListDataQualityRulesetEvaluationRunsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListDataQualityRulesetEvaluationRunsRequest clone() {
        return (ListDataQualityRulesetEvaluationRunsRequest) super.clone();
    }

}
