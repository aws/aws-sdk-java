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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListConformancePackComplianceScores"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConformancePackComplianceScoresRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     * </p>
     */
    private ConformancePackComplianceScoresFilters filters;
    /**
     * <p>
     * Determines the order in which conformance pack compliance scores are sorted. Either in ascending or descending
     * order.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Conformance pack compliance scores are sorted in reverse alphabetical order if you enter <code>DESCENDING</code>.
     * </p>
     * <p>
     * You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     * <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by <code>SCORE</code>,
     * conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be last when sorting by
     * ascending order and first when sorting by descending order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     * <code>SortOrder</code>.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the compliance
     * score.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The maximum number of conformance pack compliance scores returned on each page.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string in a prior request that you can use to get the paginated response for next set
     * of conformance pack compliance scores.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     * </p>
     * 
     * @param filters
     *        Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     */

    public void setFilters(ConformancePackComplianceScoresFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     * </p>
     * 
     * @return Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     */

    public ConformancePackComplianceScoresFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     * </p>
     * 
     * @param filters
     *        Filters the results based on the <code>ConformancePackComplianceScoresFilters</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConformancePackComplianceScoresRequest withFilters(ConformancePackComplianceScoresFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Determines the order in which conformance pack compliance scores are sorted. Either in ascending or descending
     * order.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Conformance pack compliance scores are sorted in reverse alphabetical order if you enter <code>DESCENDING</code>.
     * </p>
     * <p>
     * You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     * <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by <code>SCORE</code>,
     * conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be last when sorting by
     * ascending order and first when sorting by descending order.
     * </p>
     * 
     * @param sortOrder
     *        Determines the order in which conformance pack compliance scores are sorted. Either in ascending or
     *        descending order.</p>
     *        <p>
     *        By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance
     *        pack. Conformance pack compliance scores are sorted in reverse alphabetical order if you enter
     *        <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     *        <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by
     *        <code>SCORE</code>, conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be
     *        last when sorting by ascending order and first when sorting by descending order.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Determines the order in which conformance pack compliance scores are sorted. Either in ascending or descending
     * order.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Conformance pack compliance scores are sorted in reverse alphabetical order if you enter <code>DESCENDING</code>.
     * </p>
     * <p>
     * You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     * <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by <code>SCORE</code>,
     * conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be last when sorting by
     * ascending order and first when sorting by descending order.
     * </p>
     * 
     * @return Determines the order in which conformance pack compliance scores are sorted. Either in ascending or
     *         descending order.</p>
     *         <p>
     *         By default, conformance pack compliance scores are sorted in alphabetical order by name of the
     *         conformance pack. Conformance pack compliance scores are sorted in reverse alphabetical order if you
     *         enter <code>DESCENDING</code>.
     *         </p>
     *         <p>
     *         You can sort conformance pack compliance scores by the numerical value of the compliance score by
     *         entering <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by
     *         <code>SCORE</code>, conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be
     *         last when sorting by ascending order and first when sorting by descending order.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Determines the order in which conformance pack compliance scores are sorted. Either in ascending or descending
     * order.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Conformance pack compliance scores are sorted in reverse alphabetical order if you enter <code>DESCENDING</code>.
     * </p>
     * <p>
     * You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     * <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by <code>SCORE</code>,
     * conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be last when sorting by
     * ascending order and first when sorting by descending order.
     * </p>
     * 
     * @param sortOrder
     *        Determines the order in which conformance pack compliance scores are sorted. Either in ascending or
     *        descending order.</p>
     *        <p>
     *        By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance
     *        pack. Conformance pack compliance scores are sorted in reverse alphabetical order if you enter
     *        <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     *        <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by
     *        <code>SCORE</code>, conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be
     *        last when sorting by ascending order and first when sorting by descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListConformancePackComplianceScoresRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Determines the order in which conformance pack compliance scores are sorted. Either in ascending or descending
     * order.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Conformance pack compliance scores are sorted in reverse alphabetical order if you enter <code>DESCENDING</code>.
     * </p>
     * <p>
     * You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     * <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by <code>SCORE</code>,
     * conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be last when sorting by
     * ascending order and first when sorting by descending order.
     * </p>
     * 
     * @param sortOrder
     *        Determines the order in which conformance pack compliance scores are sorted. Either in ascending or
     *        descending order.</p>
     *        <p>
     *        By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance
     *        pack. Conformance pack compliance scores are sorted in reverse alphabetical order if you enter
     *        <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        You can sort conformance pack compliance scores by the numerical value of the compliance score by entering
     *        <code>SCORE</code> in the <code>SortBy</code> action. When compliance scores are sorted by
     *        <code>SCORE</code>, conformance packs with a compliance score of <code>INSUFFICIENT_DATA</code> will be
     *        last when sorting by ascending order and first when sorting by descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListConformancePackComplianceScoresRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     * <code>SortOrder</code>.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the compliance
     * score.
     * </p>
     * 
     * @param sortBy
     *        Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     *        <code>SortOrder</code>.</p>
     *        <p>
     *        By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance
     *        pack. Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the
     *        compliance score.
     * @see SortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     * <code>SortOrder</code>.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the compliance
     * score.
     * </p>
     * 
     * @return Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     *         <code>SortOrder</code>.</p>
     *         <p>
     *         By default, conformance pack compliance scores are sorted in alphabetical order by name of the
     *         conformance pack. Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical
     *         value of the compliance score.
     * @see SortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     * <code>SortOrder</code>.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the compliance
     * score.
     * </p>
     * 
     * @param sortBy
     *        Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     *        <code>SortOrder</code>.</p>
     *        <p>
     *        By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance
     *        pack. Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the
     *        compliance score.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortBy
     */

    public ListConformancePackComplianceScoresRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     * <code>SortOrder</code>.
     * </p>
     * <p>
     * By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance pack.
     * Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the compliance
     * score.
     * </p>
     * 
     * @param sortBy
     *        Sorts your conformance pack compliance scores in either ascending or descending order, depending on
     *        <code>SortOrder</code>.</p>
     *        <p>
     *        By default, conformance pack compliance scores are sorted in alphabetical order by name of the conformance
     *        pack. Enter <code>SCORE</code>, to sort conformance pack compliance scores by the numerical value of the
     *        compliance score.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortBy
     */

    public ListConformancePackComplianceScoresRequest withSortBy(SortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of conformance pack compliance scores returned on each page.
     * </p>
     * 
     * @param limit
     *        The maximum number of conformance pack compliance scores returned on each page.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of conformance pack compliance scores returned on each page.
     * </p>
     * 
     * @return The maximum number of conformance pack compliance scores returned on each page.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of conformance pack compliance scores returned on each page.
     * </p>
     * 
     * @param limit
     *        The maximum number of conformance pack compliance scores returned on each page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConformancePackComplianceScoresRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string in a prior request that you can use to get the paginated response for next set
     * of conformance pack compliance scores.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string in a prior request that you can use to get the paginated response for
     *        next set of conformance pack compliance scores.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string in a prior request that you can use to get the paginated response for next set
     * of conformance pack compliance scores.
     * </p>
     * 
     * @return The <code>nextToken</code> string in a prior request that you can use to get the paginated response for
     *         next set of conformance pack compliance scores.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string in a prior request that you can use to get the paginated response for next set
     * of conformance pack compliance scores.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string in a prior request that you can use to get the paginated response for
     *        next set of conformance pack compliance scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConformancePackComplianceScoresRequest withNextToken(String nextToken) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
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

        if (obj instanceof ListConformancePackComplianceScoresRequest == false)
            return false;
        ListConformancePackComplianceScoresRequest other = (ListConformancePackComplianceScoresRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConformancePackComplianceScoresRequest clone() {
        return (ListConformancePackComplianceScoresRequest) super.clone();
    }

}
