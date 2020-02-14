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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned findings.
     * </p>
     */
    private AwsSecurityFindingFilters filters;
    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     */
    private java.util.List<SortCriterion> sortCriteria;
    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>GetFindings</code> operation, set the
     * value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned findings.
     * </p>
     * 
     * @param filters
     *        The finding attributes used to define a condition to filter the returned findings.
     */

    public void setFilters(AwsSecurityFindingFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned findings.
     * </p>
     * 
     * @return The finding attributes used to define a condition to filter the returned findings.
     */

    public AwsSecurityFindingFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The finding attributes used to define a condition to filter the returned findings.
     * </p>
     * 
     * @param filters
     *        The finding attributes used to define a condition to filter the returned findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withFilters(AwsSecurityFindingFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     * 
     * @return The finding attributes used to sort the list of returned findings.
     */

    public java.util.List<SortCriterion> getSortCriteria() {
        return sortCriteria;
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     * 
     * @param sortCriteria
     *        The finding attributes used to sort the list of returned findings.
     */

    public void setSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        if (sortCriteria == null) {
            this.sortCriteria = null;
            return;
        }

        this.sortCriteria = new java.util.ArrayList<SortCriterion>(sortCriteria);
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortCriteria(java.util.Collection)} or {@link #withSortCriteria(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sortCriteria
     *        The finding attributes used to sort the list of returned findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withSortCriteria(SortCriterion... sortCriteria) {
        if (this.sortCriteria == null) {
            setSortCriteria(new java.util.ArrayList<SortCriterion>(sortCriteria.length));
        }
        for (SortCriterion ele : sortCriteria) {
            this.sortCriteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The finding attributes used to sort the list of returned findings.
     * </p>
     * 
     * @param sortCriteria
     *        The finding attributes used to sort the list of returned findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withSortCriteria(java.util.Collection<SortCriterion> sortCriteria) {
        setSortCriteria(sortCriteria);
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>GetFindings</code> operation, set the
     * value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination. On your first call to the <code>GetFindings</code> operation,
     *        set the value of this parameter to <code>NULL</code>.</p>
     *        <p>
     *        For subsequent calls to the operation, to continue listing data, set the value of this parameter to the
     *        value returned from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>GetFindings</code> operation, set the
     * value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     * 
     * @return The token that is required for pagination. On your first call to the <code>GetFindings</code> operation,
     *         set the value of this parameter to <code>NULL</code>.</p>
     *         <p>
     *         For subsequent calls to the operation, to continue listing data, set the value of this parameter to the
     *         value returned from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the <code>GetFindings</code> operation, set the
     * value of this parameter to <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value
     * returned from the previous response.
     * </p>
     * 
     * @param nextToken
     *        The token that is required for pagination. On your first call to the <code>GetFindings</code> operation,
     *        set the value of this parameter to <code>NULL</code>.</p>
     *        <p>
     *        For subsequent calls to the operation, to continue listing data, set the value of this parameter to the
     *        value returned from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of findings to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * 
     * @return The maximum number of findings to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of findings to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of findings to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withMaxResults(Integer maxResults) {
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortCriteria() != null)
            sb.append("SortCriteria: ").append(getSortCriteria()).append(",");
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

        if (obj instanceof GetFindingsRequest == false)
            return false;
        GetFindingsRequest other = (GetFindingsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortCriteria() == null ^ this.getSortCriteria() == null)
            return false;
        if (other.getSortCriteria() != null && other.getSortCriteria().equals(this.getSortCriteria()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortCriteria() == null) ? 0 : getSortCriteria().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsRequest clone() {
        return (GetFindingsRequest) super.clone();
    }

}
